// 定义一个对象集合
const list = [{ name: '张三', age: 18, gender: 1 }, { name: '李四', age: 22, gender: 1 }, { name: '王五', age: 12, gender: 0 }]

//是否存在一个叫张三的人
const flag1 = list.some(item => item.name === '张三');  

//第一个叫张三的全部信息，如果没有叫张三的则item是undefined
const item = list.find(item => item.name === '张三'); 

//所有叫张三的人
const items = list.filter(item => item.name === '张三');

//第一个叫张三的在集合中的位置，没有index是-1
const index = list.findIndex(item => item.name === '张三'); 


// 定义一个数组
const array = ['张三','李四','王五']

//查找第一叫张三的人
const index1 = array.indexOf('张三');