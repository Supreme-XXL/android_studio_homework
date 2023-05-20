<template>
  <view class="content">
    <view class="avatarWrapper">
      <view class="avatar">
        <image class="img" src="../../static/QQ.png" mode="widthFix"></image>
      </view>
      <view>
        <text class="textQQ">QQ</text>
      </view>
    </view>

    <view class="form">
      <view class="inputWrapper">
        <input class="input" type="text" value="" placeholder="QQ号/QID/邮箱/手机号" />
      </view>

      <view class="inputWrapper">
        <input class="input" type="password" value="" placeholder="输入QQ密码" />
      </view>

      <view class="service">
        <view>
          <radio style="transform: scale(0.7)"></radio>
          <text class="accessText">已阅读并同意<text class="textservice">服务协议</text>和<text
              class="textservice">QQ隐私保护指引</text></text>
        </view>
      </view>

      <view class="loginWrapper">
        <view class="loginBtn">
          <image class="imgright" src="../../static/right38.png" mode="widthFix"></image>
        </view>
      </view>
    </view>
    <view class="otherchoice">
      <text class="other">手机号登录</text>
      <text>|</text>
      <text class="other">新用户注册</text>
      <text>|</text>
      <text class="other">更多选项</text>
    </view>
  </view>
</template>

<script>
  export default {
    data() {
      return {

      }
    },
    onLoad() {

    },
    methods: {

    }
  }
</script>

<style>
  .content {
    width: 100vw;
    height: 100vh;
  }

  .avatarWrapper {
    height: 30vh;
    width: 100vw;
    margin-top: 160upx;
    display: flex;
    justify-content: center;
  }

  .avatar {
    height: 100upx;
    width: 100upx;
    overflow: hidden;
  }

  .avatar .img {
    width: 100%;
  }

  .textQQ {
    font-size: 70upx;
  }

  .form {
    padding: 0 100upx;
    margin-top: -180px;
  }

  .inputWrapper {
    width: 100%;
    height: 140upx;
    background: #f0f0f8;
    border-radius: 40px;
    box-sizing: border-box;
    padding: 0 20px;
    margin-top: 15px;
  }

  .inputWrapper .input {
    width: 100%;
    height: 100%;
    text-align: center;
    font-size: 15px;
  }

  .loginWrapper {
    height: 30vh;
    width: 100vw;

    padding: 40px 110px;
    margin-top: 15px;
  }

  .loginBtn {
    height: 150upx;
    width: 150upx;
    background-color: #f0f0f8;
    border-radius: 50%;
    display: flex;
    justify-content: center;
    align-items: center;
  }

  .loginBtn .imgright {
    width: 50%;
  }

  .service {
    margin-top: 30px;
    text-align: center;
  }

  .textservice {
    color: blue;
  }

  .accessText {
    font-size: 12px;
  }

  .otherchoice {
    margin-top: 60px;
    margin-left: 50px;
    font-size: 10px;
    font-weight: 600;
  }

  .other {
    margin: 0 30px;
  }
</style>