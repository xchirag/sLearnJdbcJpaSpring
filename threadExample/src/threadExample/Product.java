package threadExample;

import java.util.Objects;

public class Product {

	
	public int x;

	@Override
	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + x;
		return Objects.hash(x);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (x != other.x)
			return false;
		return true;
	}
	
}
