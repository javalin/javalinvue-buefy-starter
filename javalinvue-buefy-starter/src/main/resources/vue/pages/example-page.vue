<template id="example-page">
  <app-frame>
    <div class="example-page">
      <b-button type="is-primary" icon-left="home" @click="showDialog">
        {{ buttonText }}
      </b-button>
    </div>
  </app-frame>
</template>
<script>
Vue.component("example-page", {
  template: "#example-page",
  data: () => ({
    buttonText: "Click me"
  }),
  methods: {
    showDialog() {
      this.$buefy.dialog.alert({
        title: "Thank you for clicking me!",
        message: "You can close me too.",
      })
    }
  }
});
</script>
