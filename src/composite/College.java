package composite;

import java.util.ArrayList;
import java.util.List;

 public class College extends OrganizationComponent {
    List<OrganizationComponent> organizationComponentLists = new ArrayList<>();

    //构造器
    public College(String name, String des) {
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
