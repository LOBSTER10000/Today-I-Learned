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


async function go1(){
    let user = await call('lobster');
    console.log(`${user}님 환영합니다`);
    let videos = await back(user);
    console.log(`${videos}`);
    let title = await hell(videos);
    console.log(title);
}

go1();