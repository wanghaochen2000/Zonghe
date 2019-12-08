综合性实验  学生选课系统设计
==
一实验目的
--
    1.学会分析学生选课系统，熟练使用GUI窗体及其组件设计窗体界面完成学生选课过程业务逻辑编程，再用基于文件保存并读取数据处理异常。
二实验要求
--
    1、	设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作。
    2、	基于事件模型对业务逻辑编程，实现在界面上支持上述操作。
    3、	针对操作过程中可能会出现的各种异常，做异常处理
    4、	基于输入/输出编程，支持学生、课程、教师等数据的读写操作。
三实验过程
--
    首先创建了学生类，老师类，运用了类的基本属性与方法调用，写了课程类及删减增加的代码。熟悉了gui运用自带的库AWT编写了界面，学会了方法后老师推荐用组件比较快捷简单。下载了windowbuild，通过design在线设计gui画面生成代码。然后编写触发事件，即按钮打印课表，输入开课数据到之前写好的类中，定义了数据类，然后返回到选课复选框中，可以在gui界面经行选课，退课等操作。编写多个触发事件联系之前写好的类，创造了一个矩阵用来储存开的课，然后矩阵中没一个词作为一个复选框的选项实现复选框选课，退课也是一样。然后写文件输入与输出，每当gui文本框填入一个学生的信息点击确定则提取文本框信息保存在数组中变成字符串保存在文件中，读取也是从文件中读取然后返回到gui界面。
四 流程图
--
    ![image](https://github.com/wanghaochen2000/Zonghe/blob/master/捕1获.JPG)

五 核心代码
--
	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ads frame = new Ads();
					frame.setVisible(true);	
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
这段是gui运行的地方，创建一个frame类付给Ads然后写了不能修改该界面，还有异常判断，如果不能运行则触发报错。
    
    public Ads() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
这是刚刚定义的Ads，gui界面里面的内容在这里编辑，第一句话写出了按x退出gui界面，然后设计了长宽高的大小，运用jpanel的布局
    	
	JButton button_2 = new JButton("\u6253\u5370\u8BFE\u8868");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(array);
			}
		});
这段代码是创建一个按钮然后绑定触发事件，触发打印课表，课表是之前创建的矩阵。这段实现了在gui界面点击触发打印列表。

    File f1 = new File("D:\\123.txt");
    bw = new BufferedWriter(new FileWriter(f1)); 
    bw.write(array);	    
    bw.close();
这段代码实现了打开文件夹d盘的123.txt，创建缓冲区bufferedwriter。然后把字符串写入用write。最后关闭函数。
	 
	 JButton button = new JButton("\u786E\u5B9A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b=textField.getText().split(",", 4);
				students a= new students(b[0],b[1],b[2],b[3]);
			    a.displayCourse();
    这里先编辑了一个文本框，然后在旁边写入一个按钮绑定其触发案件，点击确定就会通过gettext获取里面的值，返回到之前写好的类，即开课。然后把b的值用split函数切割成四个字符串放入b的数组传入之前写好的学生类，然后保存到文件里。

六 系统运行截图
--
    ![image](https://github.com/wanghaochen2000/Zonghe/blob/master/gdg.jpg)
    ![image](https://github.com/wanghaochen2000/Zonghe/blob/master/捕获.JPG)
 
 
七 编程感想
--
    通过本次综合实验我学会设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作。基于事件模型对业务逻辑编程，实现在界面上支持上述操作。针对操作过程中可能会出现的各种异常，做异常处理。基于输入/输出编程，支持学生、课程、教师等数据的读写操作。学会了运用简单的插件使繁琐的gui编程变得简单有趣，也对触发事件有了深刻的印象。我对类的印象加深，熟练的写出触发事件很有成就感。在完成实验的时候也遇到了很多困难，比如有点值返回的是空值，原因那个定义不是全局变量，有的在静止类中有非静止变量导致错误等。从中明白了很多java基础，对继承，静止类，私密，公开变量有了了解。
















                                                               王昊辰
                                                                计182
                                                             2018310765
