function first() {
  second();
  console.log('첫번째입니다');
}

function second() {
  third();
  console.log('두번째입니다');
}

function third() {
  console.log('세번째입니다');
}

first();
