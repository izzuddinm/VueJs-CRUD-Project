<template>
  <div>
    <div>
      <router-link to="/">
        <button type="button" class="btn btn-warning text-dark mt-4 ml-5">Back</button>
      </router-link>
    </div>
    <Form></Form>
  </div>
</template>

<script>
import Form from "../components/InsertForm.vue";
export default {
  name: "FormPage",
  components: {
    Form,
  },
};
</script>

<style></style>
