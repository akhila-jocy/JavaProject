package aggregation;

public class AggregationEx2 {
	String bookname ;
	int bookprice;
	AggregationEx1 ref; //Aggregation
	public AggregationEx2(String bookname ,int bookprice ,AggregationEx1 ref)
	{
		this.bookname=bookname;
		this.bookprice =bookprice;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println(ref.authorid +" " +ref.authorname);
		System.out.println(bookprice +" " +bookname);
	}
	public static void main(String[] args) {
		AggregationEx1 obj1 = new AggregationEx1("akhila",01);
		AggregationEx2 obj2 =new AggregationEx2("abc",200,obj1);
		obj2.display();

	}

}
