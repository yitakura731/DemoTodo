<template>
  <div class="p-3">
    <div class="fs-3">TODO一覧</div>
    <div v-for="n in 3" :key="n">
      <div class="fs-5">TODO {{ n }}</div>
      <p>こんにちわ</p>
    </div>
  </div>
</template>
