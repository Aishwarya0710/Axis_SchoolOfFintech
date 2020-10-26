package com.manipal.service.impl

import com.manipal.dao.impl.AdminDao



class AdminService()
{
    var adminDao=AdminDao()
    fun getGeneratedRevenue()
    {


        var revenue=adminDao.getRevenueDao()
        println("Generated Reveneue is "+revenue)
    }
    fun getLabData()
    {

        adminDao.getLabDatadao()
    }
    fun getCustomerData()
    {

        adminDao.getCustomerDatadao()
    }
}
