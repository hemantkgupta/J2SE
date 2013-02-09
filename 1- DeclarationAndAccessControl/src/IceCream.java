public enum IceCream {
	VANILLA ("white"){int age(){return 10;
	}
	},
	STRAWBERRY ("pink"){int age(){return 10;
	}
	},
	WALNUT ("brown"){int age(){return 10;
	}
	},
	CHOCOLATE ("dark brown"){int age(){return 10;
	}
	};

	String color;

	IceCream (String color) {
			this.color = color;
		}
	abstract int age();	

 		public static void main (String[] args) {
 			System.out.println (VANILLA);
 			System.out.println (CHOCOLATE);
 		}
 	}