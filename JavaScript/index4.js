function goMart(){
    console.log('마트에서 어떤 음식을 살지 고민입니다');
}

function pickDrink(callback){
    setTimeout(()=>{
        console.log('고민 끝!');
        product = '레몬에이드';
        price = 2000;
        callback(product, price);

    },1000)
}

function goPay(product, price){
    console.log(`${product}, ${price}`);
}

let product;
let price;

goMart();
pickDrink(goPay);
