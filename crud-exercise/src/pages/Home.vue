<template>
  <div>
    <Header></Header>
    <Add ></Add>
    <Table v-if="!success" @deleteEmit="changeSuccess"></Table>
    <SuccessForm v-else textSuccess="Deleted"></SuccessForm>
    <Copyright></Copyright>
  </div>
</template>

<script>
import Header from "../components/Header.vue";
import Add from "../components/Add.vue";
import Table from "@/components/Table.vue";
import Copyright from "../components/Copyright.vue";
import SuccessForm from "./SuccessForm.vue";
export default {
  name: "HomePage",
  components: {
    Header,
    Copyright,
    Add,
    Table,
    SuccessForm
  },
  data() {
    return {
      success: false,
    }
  },
  methods: {
    changeSuccess() {
      this.success = true;
    }
  }
};
</script>

<style></style>
