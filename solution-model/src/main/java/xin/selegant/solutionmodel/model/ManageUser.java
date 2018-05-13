package xin.selegant.solutionmodel.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;

/* 
* 
* gen by wangtao 2018-05-13
*/
public class ManageUser  {
	
	private Integer id ;
	//用户角色
	private Integer roleId ;
	//0 正常（默认） 9 删除
	private String dataStatus ;
	//姓名
	private String name ;
	//密码
	private String password ;
	//1 启用 2未启用 3暂停
	private String status ;
	//记录创建时间
	private Date createTime ;
	//记录修改时间
	private Date updateTime ;
	
	public ManageUser() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}
	
	/**用户角色
	*@return 
	*/
	public Integer getRoleId(){
		return  roleId;
	}
	/**用户角色
	*@param  roleId
	*/
	public void setRoleId(Integer roleId ){
		this.roleId = roleId;
	}
	
	/**0 正常（默认） 9 删除
	*@return 
	*/
	public String getDataStatus(){
		return  dataStatus;
	}
	/**0 正常（默认） 9 删除
	*@param  dataStatus
	*/
	public void setDataStatus(String dataStatus ){
		this.dataStatus = dataStatus;
	}
	
	/**姓名
	*@return 
	*/
	public String getName(){
		return  name;
	}
	/**姓名
	*@param  name
	*/
	public void setName(String name ){
		this.name = name;
	}
	
	/**密码
	*@return 
	*/
	public String getPassword(){
		return  password;
	}
	/**密码
	*@param  password
	*/
	public void setPassword(String password ){
		this.password = password;
	}
	
	/**1 启用 2未启用 3暂停
	*@return 
	*/
	public String getStatus(){
		return  status;
	}
	/**1 启用 2未启用 3暂停
	*@param  status
	*/
	public void setStatus(String status ){
		this.status = status;
	}
	
	/**记录创建时间
	*@return 
	*/
	public Date getCreateTime(){
		return  createTime;
	}
	/**记录创建时间
	*@param  createTime
	*/
	public void setCreateTime(Date createTime ){
		this.createTime = createTime;
	}
	
	/**记录修改时间
	*@return 
	*/
	public Date getUpdateTime(){
		return  updateTime;
	}
	/**记录修改时间
	*@param  updateTime
	*/
	public void setUpdateTime(Date updateTime ){
		this.updateTime = updateTime;
	}
	

}
