package behavior.chainofresponsibility;


/**
 * 过滤器
 *
 * @author wg
 */
public interface Filter {

    void doFilter(Request request, Response response, FilterChain chain);
}
