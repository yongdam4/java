package h.inherit.ex2;

	public class Tv extends Product {
		private int inch;

		public Tv() {
			super();
		}

		public Tv(String brand, String pCode, String pName, int price, int inch) {
			super(brand, pCode, pName, price);
			this.inch = inch;
		}

		public int getInch() {
			return inch;
		}

		public void setInch(int inch) {
			this.inch = inch;
		}
		
		
		@Override
		public String toString() {
			return "Tv [inch=" + inch + "]";
		}

		public String information() {
			return super.information() + " " +this.inch  + "인치 입니다.";
		}
		
		

}
