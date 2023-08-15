function mainFunc(p1, p2, callback){
    const result ='안녕하세요';
    console.log(result);
    callback(result);
}

function callbackFunc(result){
    console.log(result);
    console.log('콜백함수입니다');
}

mainFunc(1,2,callbackFunc);