package com.zl.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FenYe {
	// 当前请求页码
	private Integer page;
	// 每一页显示多少条
	private Integer rows = 10;
	// 符合要求的记录总数
	private Integer rowCount;
	// 一共分多少页
	private Integer pageCount;
	// 开始条数
	private Integer startRow;
	// 结束条数
	private Integer endRow;

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getRowCount() {
		return rowCount;
	}

	public void setRowCount(Integer rowCount) {
		this.rowCount = rowCount;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public Integer getStartRow() {
		return startRow;
	}

	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}

	public Integer getEndRow() {
		return endRow;
	}

	public void setEndRow(Integer endRow) {
		this.endRow = endRow;
	}

	@Override
	public String toString() {
		return "FenYe [page=" + page + ", rows=" + rows + ", rowCount=" + rowCount + ", pageCount=" + pageCount
				+ ", startRow=" + startRow + ", endRow=" + endRow + "]";
	}

}
