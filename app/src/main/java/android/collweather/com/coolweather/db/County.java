package android.collweather.com.coolweather.db;

/**
 * Created by wangkai on 2017/4/4.
 * 县
 */

public class County {
	private int id;
	private String countryNmae;//记录县的名字
	private String weatherId;//记录县所对应的天气id
	private int cityId;//记录当前县所属市的id
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getCountryNmae(){
		return countryNmae;
	}
	public void setCountryNmae(String countryNmae){
		this.countryNmae = countryNmae;
	}
	public String getWeatherId(){
		return weatherId;
	}
	public void setWeatherId(String weatherId){
		this.weatherId = weatherId;
	}
	public int getCityId(){
		return cityId = cityId;
	}
	public void setCityId(int cityId){
		this.cityId = cityId;
	}
}
