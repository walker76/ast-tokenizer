package handlers;

import com.github.javaparser.ast.Node;

import java.util.ArrayList;
import java.util.List;

public class VoidTypeHandler extends BaseHandler {
    @Override
    public List<String> handle(Node node) {
        List<String> tokens = new ArrayList<>();
        tokens.add("VOID");
        return tokens;
    }
}