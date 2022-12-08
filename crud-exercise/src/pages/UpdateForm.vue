<template>
  <div>
    <div>
      <router-link to="/">
        <button type="button" class="btn btn-warning text-dark mt-4 ml-5">Back</button>
      </router-link>
    </div>
   <InsertForm></InsertForm>
   <!-- <Table class="d-none"></Table> -->
    <Copyright></Copyright>
  </div>
</template>

<script>
import InsertForm from "../components/InsertForm.vue";
// import Table from "@/components/Table.vue";
import Copyright from "../components/Copyright.vue";
export default {
  name: "UpdateFormPage",
  components: {
    Copyright,
    InsertForm,
    // Table
  },
  methods: {
    updateStudentFunc(item) {
      this.studentData = item;
    },
  },
  data() {
    return {
      studentData: null,
    };
  },
};
</script>

<style></style>
