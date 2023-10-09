package xyz.linyh.yhapigateway.service;

import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;
import xyz.linyh.yhapi.ducommon.model.entity.Interfaceinfo;

import java.util.Collection;
import java.util.Map;

/**
 * 用来对数据库里面的路由进行操作
 * @author lin
 */
public interface RouteService {

    /**
     * 获取数据库里面的所有路由信息
     */
    public Map<String,Interfaceinfo> getRouteDefinitions();

    /**
     * 获取所有路由
     * @return
     */
    public Map<String,Interfaceinfo> getRoutes();


    /**
     * 新增新的路由
     * @param serverRequest
     * @return
     */
    Mono<ServerResponse> updateInterfaceCache(ServerRequest serverRequest);


}
