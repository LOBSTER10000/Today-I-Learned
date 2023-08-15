function call(name){
    return new Promise((resolve, reject)=>{
    setTimeout(()=>{
        console.log(name);
        resolve(name);
    }, 1000)
    })
}


function back(){
    return new Promise((resolve, reject)=>{
        setTimeout(()=>{
            console.log('back');
            resolve('back을 실행했구나');
        }, 1000)
        })
}

function hell(){
    return new Promise((resolve, reject)=>{
        setTimeout(()=>{
            resolve('callback hell');
        }, 1000)
        })
}

call('lobster')
.then((result)=>{
    console.log(`${result}님 안녕하세요`);
    return back(result)
})
.then((result)=>{
    console.log(result);
    return hell(result);
})
.then((result)=>{
    console.log(result);
})
.catch((err)=>{
    console.error(err);
})