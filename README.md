# CustomToast
自定义toast提示,可设置,做了封装
#### 效果图
![](https://github.com/leifu1107/CustomToast/raw/master/screenshots/1.gif) 

## 如何使用
---------
#### Step 1.添加依赖
项目的 build.gradle 添加

```java
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
/app/build.gradle
  ```java
  	dependencies {
	        compile 'com.github.leifu1107:CustomToast:1.0'
	}

```
#### Step 2.建议在Application中初始化
```java
**
 * 创建人: 雷富
 * 创建时间: 2018/1/31 17:01
 * 描述:
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CustomToast.init(this);
    }
}
```
#### Step 3.Activity中直接使用
```java
   CustomToast.error("这是一个提示错误的Toast！");
   CustomToast.success("这是一个成功Toast！);
   CustomToast.info("这是一个信息的Toast！");
   CustomToast.warning("这是一个警告的Toast！");
   CustomToast.normal("这是一个普通的Toast！");
 ```
