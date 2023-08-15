function promise1(flag){
    return new Promise((resolve,reject) =>{
        if(flag){
            resolve('promise 상태는 fulfilled!! then으로 연결됩니다');
        } else {
            reject('promise 상태는 rejected!!  catch로 연결됩니다');
        }
    });
}

promise1(true)
.then(function(result){
    console.log(result);
})
.catch((err)=>{
    console.error(err);
})

promise1(false)
.then((result)=>{
    console.log(result);
})
.catch((err)=>{
    console.error(err);
})