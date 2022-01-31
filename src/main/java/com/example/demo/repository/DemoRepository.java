package com.example.demo.repository;

import com.example.demo.configuration.MyBatisConnection;
import com.example.demo.mapper.SeguroMapper;
import model.Seguro;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class DemoRepository {

    private static final Logger LOG = LoggerFactory.getLogger(DemoRepository.class);
    private static final String SEGURO_RATIFICAR_NOMBRE = "N_EPS_ESTADO";
    private static final String SEGURO_RATIFICAR_CODIGO = "10";

    public void getSeguroRatificacionEstado() throws SQLException {

        SqlSession sqlSession = MyBatisConnection.openSession();
//
//        SeguroMapper        segurosMapper = sqlSession.getMapper(SeguroMapper.class);
//        Map<String, Object> params        = new HashMap<>();
//        params.put(SEGURO_RATIFICAR_NOMBRE, SEGURO_RATIFICAR_CODIGO);
//
//        segurosMapper.queryBucarSegurosRatificarByEstado(params);
//
//        List<Seguro> seguros = (List<Seguro>) params.get("seguro");
//
//        LOG.info(seguros.toString());

    }
}
