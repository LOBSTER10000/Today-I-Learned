async function go1(){
    return 1;
}

async function go2(){
    return Promise.resolve(go1());
}

async function go3(){
    return go1();
}

(async () => {
    console.log(await go1()); 
    console.log(await go2());  
    console.log(await go3());  
})();

// async 함수 즉시 실행 방법 (async ()=>{...})() 위 방식으로 실행