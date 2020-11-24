package mediator;

public class Tester {
    public static void main(String[] args) {
        IMediator mediator = new UniteMediator();
        Country china = new Country("中国", mediator);
        Country usa = new Country("美国", mediator);
        Country russian = new Country("俄国", mediator);
        mediator.add(china);
        mediator.add(usa);
        mediator.add(russian);
        china.send("中国万岁!");
    }
}
