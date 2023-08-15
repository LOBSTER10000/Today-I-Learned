const { odd, even } = require('./var');

function checkOddOrEven(num) {
  if (num % 2) {
    // 홀수만
    return odd;
  }
  return even;
}

module.exports = checkOddOrEven;
