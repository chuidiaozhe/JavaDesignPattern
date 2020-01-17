package composite;

import java.util.ArrayList;
import java.util.List;

//University 就是Composite ，可以管理College
public class University extends OrganizationComponent {
    List<OrganizationComponent> organizationComponentLists = new ArrayList<>();

    //构造器
    public University(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        super.add(organizationComponent);
        organizationComponentLists.add(organizationComponent);

    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        super.remove(organizationComponent);
        organizationComponentLists.remove(organizationComponent);
    }

    @Override
    protected void print() {
        System.out.println("--------------" + getName() + "--------------");
          //遍历 organizationComponentLists
        for (OrganizationComponent organizationComponent : organizationComponentLists) {
            organizationComponent.print(); }
    }
}
