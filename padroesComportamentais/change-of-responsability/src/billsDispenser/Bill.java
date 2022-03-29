package billsDispenser;

public class Bill {
	private Integer value;
	private Bill next;
	public Bill(Integer value, Bill next) {
		super();
		this.value = value;
		this.next = next;
	}
	
	public Bill(Integer value ) {
		this.value = value; 
	}

	public void setNext(Bill next) {
		this.next = next;
	}
	
	public void execute(Integer remaining) {
		if(remaining >= value) {
			int bills = remaining / value;
			remaining %= value;
			System.out.println(String.format("- %d bill(s) of $%d, $%d remaining", bills, value, remaining));
		}
		if(remaining == 0) return;
		if(next != null) next.execute(remaining);
	}
}
