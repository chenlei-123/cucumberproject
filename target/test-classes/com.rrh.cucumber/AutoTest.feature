# language: zh-CN
功能: UI自动化的测试demo

  场景大纲: 多次执行进入借入页面，验证其逻辑
    假如 启动代理服务器，并传递参数json"<mockJson>"
    假如 实例化Android driver
    并且 等待首页文本"我要投资"渲染成功
    并且 点击"钱包"按钮
    并且 等待钱包页"余额生息"标记加载成功
    并且 点击"余额生息"按钮
    并且 点击"借入"按钮
    那么 验证界面元素正常


    例子:
      | mockJson                 |
      | list/rate/rate0.json     |
      | list/rate/rate24.json    |
      | list/rate/rate100.json   |
      | list/rate/rateEmpty.json |
      | list/rate/rateFloat.json |






