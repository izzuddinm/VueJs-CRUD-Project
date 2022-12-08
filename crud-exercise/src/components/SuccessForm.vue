<template>
  <div style="display: flex; justify-content: center" class="mt-4 mb-5">
    <div class="mt-4" style="width: 400px">
      <div class="card-body border rounded border-primary text-center">
        <div class="p-4">
          <h3>Student data has been {{ textSuccess }} !!</h3>
          <div>
            <router-link v-show="!showButton" to="/" class="btn btn-primary ">
            Close
            </router-link>
          </div>
          <button v-show="showButton" @click="reloadFunc" class="btn btn-primary">Back</button>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "SuccessFormComponent",
  mounted() {
    if (this.$route.path === "/insert") {
      this.textSuccess = "Inputed";
    } else if(this.$route.path == "/") {
      this.textSuccess = "Deleted";
      this.showButton = true;
    } else {
      this.textSuccess = "updated";
    }
  },
  data() {
    return {
      textSuccess: null,
      showButton: null,
    };
  },
  methods: {
    reloadFunc() {
      location.reload();
    },
  },
  // props: ["textSuccess"],
};
</script>

<style></style>
