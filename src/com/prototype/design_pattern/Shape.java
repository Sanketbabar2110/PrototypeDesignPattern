package com.prototype.design_pattern;

public class Shape implements Cloneable {

	private String shapeName;

	public Shape() {
		super();
	}

	public Shape(String shapeName) {
		super();
		this.shapeName = shapeName;
	}

	@Override
	protected Shape clone() throws CloneNotSupportedException {
		Shape s = new Shape();
		s.setShapeName(shapeName);
		return s;
	}

	public String getShapeName() {
		return shapeName;
	}

	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}

}
