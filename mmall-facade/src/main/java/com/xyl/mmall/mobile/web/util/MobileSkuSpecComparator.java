package com.xyl.mmall.mobile.web.util;

import java.util.Comparator;

import com.xyl.mmall.mainsite.vo.SizeSpecVO;



public class MobileSkuSpecComparator implements Comparator<SizeSpecVO> {

	@Override
	public int compare(SizeSpecVO arg0, SizeSpecVO arg1) {
		return (int) (arg0.getIndex() - arg1.getIndex());
	}

}
