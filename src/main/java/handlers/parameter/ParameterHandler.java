package handlers.parameter;

import com.github.javaparser.ast.Node;
import handlers.BaseHandler;
import handlers.HandlerFactory;

import java.util.ArrayList;
import java.util.List;

public class ParameterHandler extends BaseHandler {
    @Override
    public List<String> handle(Node node) {
        List<String> tokens = new ArrayList<>();
        for(Node child : node.getChildNodes()){
            BaseHandler handler = HandlerFactory.getHandler(child);
            if(handler != null) {
                tokens.addAll(handler.handle(child));
            } else {
                System.out.println(child.getClass().getSimpleName());
            }
        }
        return tokens;
    }
}