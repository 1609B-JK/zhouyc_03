/** 
 * <pre>项目名称:ssh-hero 
 * 文件名称:page.java 
 * 包名:com.jk.util 
 * 创建日期:2017年3月14日上午10:50:33 
 * Copyright (c) 2017, zhouyanchen 1186012559@qq.com  All Rights Reserved.</pre> 
 */  
package common;

/** 
 * <p>项目名称：ssh-hero    
 * 类名称：page    
 * 类描述：    
 * 创建人：zhouyanchen 1186012559@qq.com    
 * 创建时间：2017年3月14日 上午10:50:33    
 * 修改人：zhouyanchen 1186012559@qq.com 
 * 修改时间：2017年3月14日 上午10:50:33    
 * 修改备注：       
 * @version </p>    
 */
public class Page {

	//当前页
	private int pageIndex = 1;
	
	//每页条数
	private int pageSize = 3;
	
	//总条数
	private int totalCount;
	
	//总页数
	private int totalPage;
	
	//开始位置
	private int startPos;
	
	//结束位置
	private int endPos;

	//计算分页信息
	public void computePageInfo(){
		if (0 == pageSize) {
			pageSize = 3;
		}
		//总页数
		totalPage = totalCount % pageSize == 0 
				? totalCount / pageSize 
				: totalCount / pageSize + 1;
		
		//如果当前页 大于 总页数
		if(pageIndex > totalPage){
			
			//将当前页设置为总页数
			pageIndex = totalPage;
		}
		
		//如果当前页  小于 1
		if(pageIndex < 1){
			
			//将当前页赋值为1
			pageIndex = 1;
		}
		
		//开始位置 = 每页条数 * （当前页 - 1）
		startPos = pageSize * (pageIndex - 1) + 1;
		
		//结束位置 = 每页条数 * 当前页 - 1
		endPos = pageSize * pageIndex ;
		
	}
	
	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getStartPos() {
		return startPos;
	}

	public void setStartPos(int startPos) {
		this.startPos = startPos;
	}

	public int getEndPos() {
		return endPos;
	}

	public void setEndPos(int endPos) {
		this.endPos = endPos;
	}
}
