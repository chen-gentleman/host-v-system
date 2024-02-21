<template>
  <div>
    <div style="margin: 10px 0">
      <el-carousel height="450px" :interval="10000">
        <el-carousel-item v-for="item in imgs" :key="item">
          <img :src="item" alt="" style="width: 100%">
        </el-carousel-item>
      </el-carousel>
    </div>

    <el-card style="width: 50%;  margin: 10px 0">
      <h2 style="margin-bottom: 20px">公告列表</h2>
      <el-collapse accordion  v-model="active">
        <el-collapse-item v-for="(item,index) in notices" :key="item.id" :name="'' + index">
          <template slot="title">
            <span style="font-size: 20px;">{{ item.name }}</span>
            <span style="margin-left: 10px">{{ item.time }}</span>
          </template>
          <div>{{ item.content }}</div>
        </el-collapse-item>
      </el-collapse>
    </el-card>


    <div style="margin: 10px 0">
      <el-row :gutter="10">
        <el-col :span="6" v-for="item in files" :key="item.id" style="margin-bottom: 10px">

          <div style="border: 1px solid #ccc; padding-bottom: 10px">
            <img :src="item.url" alt="" style="width: 100%">
            <div style="color: #666; padding: 10px">{{ item.name }}</div>
            <div style="padding: 10px"><el-button type="primary">购买</el-button></div>
          </div>
        </el-col>
      </el-row>
    </div>
  </div>
</template>

<script>
export default {
  name: "FrontHome",
  data() {
    return {
      imgs: [
          'https://img30.360buyimg.com/babel/s1580x830_jfs/t1/109361/24/22897/74054/621ede58E099d37e3/f12730c81df6046a.jpg!cc_1580x830.webp',
          'https://img13.360buyimg.com/babel/s1580x830_jfs/t1/96398/30/23715/70228/6221e9d0Ec1b9fe65/f66e2ad76314d6cd.jpg!cc_1580x830.webp'
      ],
      files: [],
      notices: [],
      active: '0'
    }
  },
  created() {
    this.request.get("/echarts/file/front/all").then(res => {
      console.log(res.data)
      this.files = res.data.filter(v => v.type === 'png' || v.type === 'jpg' || v.type === 'webp')
    }),
            this.request.get("/notice").then(res => {
              this.notices = res.data.splice(0, 5)
            })
  },
  methods: {

  }
}
</script>

<style>

</style>
