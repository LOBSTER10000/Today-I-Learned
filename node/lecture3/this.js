console.log(this);
console.log(this === module.exports);
// 전역변수의 this는 node에서 빈객체를 의미함

function a() {
  console.log(this === global);
}
// global을 호출함
a();
