package android.collweather.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by wangkai on 2017/4/4.
 * 市
 */

public class City extends DataSupport{
	private int id;
	private String cityName;//市的名字
	private int cityCode;//市的代号
	private int procinceId;//当前市所属省的id

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getcityName(){
		return cityName;
	}
	public void setCityName(String cityName){
		this.cityName = cityName;
	}
	public int getCityCode(){
		return cityCode;
	}
	public void setCityCode(int cityCode){
		this.cityCode = cityCode;
	}
	public int getProcinceId(){
		return procinceId;
	}
	public void setProcinceId(int procinceId){
		this.procinceId = procinceId;
	}

}
