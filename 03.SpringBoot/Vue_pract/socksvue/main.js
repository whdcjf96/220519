const app = Vue.createApp({
    data(){
        return{
            product: 'Lamp',
            image: './assets/images/socks_green.jpg',
            url:'http://www.naver.com',
            inStock:false,
            details:['50% cotton','30% wool', '20% polyester'],
            variants:[
                {id:2234, color:'green'},
                {id:2235, color:'blue'}
            ]
        }
    }
})
