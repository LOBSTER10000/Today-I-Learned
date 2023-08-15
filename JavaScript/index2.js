class Cafe{
    constructor(menu, manager, price, customer){
        this.menu = menu;
        this.manager = manager;
        this.price = price;
        this.customer = customer;
    }

    getEntrance(customer, manager){
        this.customer = customer;
        this.manager = manager;

        return `${customer}님께서 입장하셨습니다 ${manager}님은 빠르게 손님 맞이를 준비해주세요`;
    }

    getOrder(menu){
        if(this.menu.includes(menu)){
            const totalPrice = this.price[menu];
            return `주문한 메뉴 : ${menu}, 가격 : ${totalPrice}원`;
        } else{
            return `주문한 메뉴가 없습니다.`;
        }
    }

// menu 매개변수: 이 메서드는 menu라는 이름의 매개변수를 받습니다. 이 menu는 주문한 메뉴의 이름을 나타냅니다.
// if(this.menu.includes(menu)): 이 줄은 this.menu 배열에 menu가 포함되어 있는지를 검사합니다. includes 메서드는 배열이 특정 요소를 포함하고 있는지 여부를 확인하는 메서드입니다.
// const totalPrice = this.price[menu];: 만약 this.menu에 menu가 포함되어 있다면, 해당 메뉴의 가격을 this.price 객체에서 가져옵니다. this.price[menu]는 this.price 객체에서 menu를 키로 사용하여 해당 메뉴의 가격을 가져오는 역할을 합니다.
// return 주문한 메뉴 : ${menu}, 가격 : ${totalPrice}원;: 위의 과정이 성공적으로 수행되면 주문한 메뉴와 가격을 문자열 형태로 반환합니다. ${menu}와 ${totalPrice}는 템플릿 리터럴을 사용하여 변수의 값을 문자열 안에 삽입하는 방식입니다.
// else: 만약 menu가 this.menu에 포함되어 있지 않다면, 즉 주문한 메뉴가 없는 경우에는 else 블록이 실행됩니다.
// return '주문한 메뉴가 없습니다.';: 주문한 메뉴가 없다는 메시지를 반환합니다.
// 이렇게 getOrder 메서드는 주어진 메뉴에 대한 주문 내역을 확인하고, 주문한 메뉴가 있을 경우에는 해당 메뉴의 가격과 함께 주문 내역을 반환하며, 주문한 메뉴가 없는 경우에는 메뉴가 없다는 메시지를 반환합니다.

    getPay(){
        
    }
}

const cafe = new Cafe();
cafe.customer = '랍비';
cafe.manager = '릴리';
cafe.menu = ['아메리카노', '카라멜마끼아또', '연유라뗴'];
cafe.price = {'아메리카노' : 3000, '카라멜마끼아또' : 5000, '연유라떼' : 6000};

console.log(cafe.getEntrance('랍스터','션'));
console.log(cafe.getOrder('아메리카노'));