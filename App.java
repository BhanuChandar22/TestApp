class App
  {
    private String name;
    private int age;
    App()
    {
    }
    App(String name,int age)
    {
      this.name = name;
      this.age = age;
    }
    public void show()
    {
      System.out.println("Name :: "+name+" Age :: "+age);
    }  
  }
