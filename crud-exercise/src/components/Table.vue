<template>
  <div
    class="d-flex flex-wrap row mt-4 mb-4 justify-content-around  ml-5 col-12 d-none"
    style="width: 85% " 
  >
    <div v-for="(item, index) in studentData" :key="index">
      <table>
        <div class="border border-primary rounded w-100 p-4 ml-4 mt-4">
          <div>
            <h5>{{ item.nama + "," + " " }}{{ item.umur + " " + "Years Old" }}</h5>
            <h5></h5>
            <h6>{{ item.deskripsi_diri }}</h6>
          </div>
          <tr>
            <td>Email</td>
            <td>: {{ item.email }}</td>
          </tr>
          <tr>
            <td>Soft Skill</td>
            <td>: {{ item.soft_skill }}</td>
          </tr>
          <tr>
            <td>Hard Skill</td>
            <td>: {{ item.hard_skill }}</td>
          </tr>
          <tr>
            <td>Interest</td>
            <td>: {{ item.interest }}</td>
          </tr>
          <div class="d-flex">
            <router-link :to="{ name: 'updateData', params:{id: item.id}}">
              <b  mutton
                type="submit"
                value="update"
                class="btn btn-warning text-dark mt-4 ml-4"
               
              >
                {{ buttonValue }}
              </b>
            </router-link>
            <button
              type="button"
              class="btn btn-danger mt-4 ml-4"
              @click="deleteStudentFunc(item.id)"
            >
              Delete
            </button>
            <div class="d-flex mt-3 ml-3">
              <img
                style="width: 32px; height: 45px"
                class="ml-3"
                src="../assets/female.png"
                alt=""
                v-show="item.jenis_kelamin == 'female'"
              />
              <img
                style="width: 40px; height: 40px"
                class="ml-3"
                src="../assets/male.png"
                alt=""
                v-show="item.jenis_kelamin == 'male'"
              />
            </div>
          </div>
        </div>
      </table>
    </div>
    
  </div>
</template>

<script>
import studentService from "../services/studentService";
// import SuccessForm from './SuccessForm.vue';
export default {
  // components:  SuccessForm ,
  name: "TableComponent",
  methods: {
    getStudent() {
      studentService
        .getAll()
        .then((response) => {
          this.studentData = response.data;
          console.log(this.studentData);
          this.jenis_kelamin = true;
        })
        .catch((e) => {
          console.log(e);
          this.jenis_kelamin = false;
        });
    },
    deleteStudentFunc(id) {
      let scope = this;
      if (confirm("Apakah anda yakin hapus?")) {
        studentService
          .deleteStudent(id)
          .then((response) => {
            console.log(response.data);
            scope.$emit('deleteEmit')
          })
          .catch((e) => {
            console.log(e);
          });
        // location.reload();
      } else {
        this.$alert("Hapus di Batalkan !");
      }
    },
  },
  mounted() {
    this.getStudent();
  },
  data() {
    return {
      studentData: null,
      buttonValue: "update",
      success: false,
      textSuccess: "Submit"
    };
  },
};
</script>

<style></style>
