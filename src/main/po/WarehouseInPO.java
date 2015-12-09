package main.po;

public class WarehouseInPO extends Receipt{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String bar;
	private String code;
	private String date;
	private String inDate;
	private String destination;
	private String area;
	private int row;
	private int shelf;
	private int position;
	private String damageCondition;
	
	
	
	public WarehouseInPO(String code){
		super();
		this.code=code;
	}

	public WarehouseInPO(String code, String area, int row, int shelf,int position) {
		super();
		this.code = code;
		this.area = area;
		this.row = row;
		this.shelf = shelf;
		this.position = position;
	}

	

	
	

	public WarehouseInPO(String bar, String code, String date, String destination, String area, int row, int shelf,
			int position, String damageCondition) {
		super();
		this.bar = bar;
		this.code = code;
		this.inDate = date;
		this.destination = destination;
		this.area = area;
		this.row = row;
		this.shelf = shelf;
		this.position = position;
		this.damageCondition = damageCondition;
	}

	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getCode() {
		return code;
	}


	public void setInDate(String inDate) {
		this.inDate = inDate;
	}


	public String getDamageCondition() {
		return damageCondition;
	}

	public void setDamageCondition(String damageCondition) {
		this.damageCondition = damageCondition;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getShelf() {
		return shelf;
	}

	public void setShelf(int shelf) {
		this.shelf = shelf;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getBar() {
		return bar;
	}

	public String getInDate() {
		return inDate;
	}
	
	
}
