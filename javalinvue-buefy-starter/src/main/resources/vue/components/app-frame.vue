<template id="app-frame">
  <div class="page-style">
    <slot></slot>
  </div>
</template>
<script>
Vue.component("app-frame", {
  template: "#app-frame",
});
</script>
<style>
.page-style {
  background: #f5f5f5;
  max-width: 1000px;
  margin: 100px auto;
  min-height: calc(100vh - 200px);
  padding: 20px;
}
</style>
