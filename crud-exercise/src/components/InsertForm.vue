<template>
  <div>
    <div style="display: flex; justify-content: center">
      <div
        v-show="!success"
        class="border rounded border-primary justify-content-center mt-3 mb-4 ml-5"
        style="padding: 50px; width: 50%; justify-content: center"
      >
        <div>
          <h1 class="text-center">{{ titleInsert }}</h1>
          <hr />
        </div>
        <form @submit.prevent="inputStudent">
          <div class="form-row">
            <div class="form-group col-md-6">
              <label>Student Name</label>
              <input
                v-model="studentData.nama"
                type="text"
                class="form-control"
                placeholder="Enter Name"
              />
            </div>
            <div class="form-group col-md-6">
              <label>Soft Skill</label>
              <input
                v-model="studentData.soft_skill"
                type="text"
                class="form-control"
                placeholder="Enter Soft Skill"
              />
            </div>
          </div>
          <div class="form-row">
            <div class="form-group col-md-3">
              <label>Student Age</label>
              <input
                v-model="studentData.umur"
                type="text"
                class="form-control"
                placeholder="Enter Age"
              />
            </div>
            <div class="form-group col-md-3">
              <label>Gender</label>
              <select
                v-model="studentData.jenis_kelamin"
                class="form-control"
                placeholder="Choose Gender "
              >
                <option selected>Choose...</option>
                <option value="male">Male</option>
                <option value="female">Female</option>
              </select>
            </div>
            <div class="form-group col-md-6">
              <label>Hard Skill</label>
              <input
                v-model="studentData.hard_skill"
                type="text"
                class="form-control"
                placeholder="Enter Hard Skill"
              />
            </div>
            <div class="form-group col-md-6">
              <label>Student Email</label>
              <input
                v-model="studentData.email"
                type="email"
                class="form-control"
                placeholder="Enter Name"
              />
            </div>
            <div class="form-group col-md-6">
              <label>Interest</label>
              <select v-model="studentData.interest" class="form-control" placeholder="">
                <option selected></option>
                <option>Web Frontend</option>
                <option>Web Backend</option>
                <option>Mobile Developer</option>
              </select>
            </div>
          </div>
          <div>
            <label>Self Description</label>
            <textarea
              v-model="studentData.deskripsi_diri"
              class="form-group col-12"
            ></textarea>
          </div>
          <button type="submit" class="btn btn-primary">{{ buttonValue }}</button>
        </form>
      </div>
    </div>
    <SuccessForm v-show="success" :textSuccess="textSuccess"></SuccessForm>
  </div>
</template>

<script>
import studentService from "../services/studentService";
import SuccessForm from "../components/SuccessForm.vue";
export default {
  name: "InsertFormComponents",
  data() {
    return {
      studentData: {
        deskripsi_diri: null,
        email: null,
        hard_skill: null,
        interest: null,
        jenis_kelamin: null,
        nama: null,
        soft_skill: null,
        umur: null,
      },
      success: false,
      buttonValue: "Submit",
      titleInsert: "Add Data Student",
    };
  },
  methods: {
    inputStudent() {
      let data = this.studentData;
      if (this.buttonValue === "Submit") {
        studentService
          .create(data)
          .then((response) => {
            console.log(response.data);
            this.success = "Inputed";
          })
          .catch((e) => {
            console.log(e);
          });
        // location.reload();
      } else {
        studentService
          .updateStudent(data.id, data)
          .then((response) => {
            console.log(response.data);
            this.success = true;
          })
          .catch((e) => {
            console.log(e);
          });
        // location.reload();
      }
    },
    getStudentId(id) {
      studentService
        .getStudentId(id)
        .then((response) => {
          this.studentData = response.data;
          this.titleInsert = "Update Data Student";
        })
        .catch((e) => {
          console.log(e);
        });
    },
  },
  components: {
    // studentService,
    SuccessForm,
  },
  mounted() {
    if (this.$route.name == "updateData") {
      this.getStudentId(this.$route.params.id);
      this.buttonValue = "update";
    }
  },
};
</script>

<style></style>
