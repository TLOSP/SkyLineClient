package main.po;
import java.io.Serializable;
public class PlaneLoadingPO  extends Receipt implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String loadingDate;//װ������
	private String flightNum;//��ת���ĺ��˱��
	private String planeNum;//�����
	private String departure;//������
	private String destination;//�����
	private String monitor;//��װԱ
	private String store;//�����
	private String shipment;//װ����������
	private double freight;//�˷�
	public PlaneLoadingPO(String loadingDate, String flightNum, String planeNum, String departure, String destination,
			String monitor, String store, String shipment, double freight) {
		super();
		this.loadingDate = loadingDate;
		this.flightNum = flightNum;
		this.planeNum = planeNum;
		this.departure = departure;
		this.destination = destination;
		this.monitor = monitor;
		this.store = store;
		this.shipment = shipment;
		this.freight = freight;
	}
	public String getLoadingDate() {
		return loadingDate;
	}
	public void setLoadingDate(String loadingDate) {
		this.loadingDate = loadingDate;
	}
	public String getFlightNum() {
		return flightNum;
	}
	public void setFlightNum(String flightNum) {
		this.flightNum = flightNum;
	}
	public String getPlaneNum() {
		return planeNum;
	}
	public void setPlaneNum(String planeNum) {
		this.planeNum = planeNum;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getMonitor() {
		return monitor;
	}
	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public String getShipment() {
		return shipment;
	}
	public void setShipment(String shipment) {
		this.shipment = shipment;
	}
	public double getFreight() {
		return freight;
	}
	public void setFreight(double freight) {
		this.freight = freight;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}