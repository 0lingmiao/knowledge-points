package java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * list
 */
public class list {

    public static void main(String[] args) {

        List<User> list = new ArrayList<>();

        list.add(new User("张三", 29));
        list.add(new User("李四", 18));
        list.add(new User("王五", 14));

        // 获取所有用户名称
        List<String> userNameArr = new ArrayList<>();
        list.forEach(user -> userNameArr.add(user.getName()));

        // 将用户转为姓名为Key,年龄是Val的map
        Map<String, Integer> userMap = new HashMap<>();
        // 简单写法
        for (User user : list) {
            userMap.put(user.getName(), user.getAge());
        }

        // JDK8写法
        userMap = list.stream().collect(Collectors.toMap(
                        User::getName, // keyMapper - 从User对象中提取键（即名字）
                        User::getAge, // valueMapper - 从User对象中提取值（即年龄）
                        (existing, replacement) -> existing, // mergeFunction - 如果键冲突，则使用现有的值（这里假设名字是唯一的）
                        HashMap::new)); // mapSupplier - 提供一个空的HashMap来存储结果
    }

    /**
     * User
     */
    public class User {

        private String name;
        private int age;

        // 构造方法
        public User(String name) {
            this.name = name;
        }

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Getter 和 Setter
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}