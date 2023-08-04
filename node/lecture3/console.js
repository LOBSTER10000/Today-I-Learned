const strong = 'abc';
const number = 1;
const boolean = true;
const obj = {
  outside: {
    inside: {
      key: 'value',
    },
  },
};

console.time('전체시간');
console.log('평범한 로그찍기');
console.log(strong, number, boolean);
console.error('에러 메세지를 나타내주세요');
console.dir(obj, { colors: false, depth: 2 });
console.dir(obj, { colors: true, depth: 1 });

function b() {
  console.trace('에러 위치 추적');
}
function a() {
  b();
}

a();

console.timeEnd('전체시간');
