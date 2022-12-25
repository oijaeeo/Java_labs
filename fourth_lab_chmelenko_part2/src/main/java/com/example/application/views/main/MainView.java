package com.example.application.views.main;

import com.example.application.models.main.Surface;
import com.example.application.models.main.SurfaceFactory;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Main")
@Route(value = "")
public class MainView extends VerticalLayout {
    NumberField aField = new NumberField();
    NumberField bField = new NumberField();
    NumberField cField = new NumberField();
    NumberField dField = new NumberField();
    NumberField eField = new NumberField();
    NumberField fField = new NumberField();
    NumberField gField = new NumberField();
    NumberField hField = new NumberField();
    NumberField kField = new NumberField();
    NumberField lField = new NumberField();
    Div aSuffix = new Div();
    Div bSuffix = new Div();
    Div cSuffix = new Div();
    Div dSuffix = new Div();
    Div eSuffix = new Div();
    Div fSuffix = new Div();
    Div gSuffix = new Div();
    Div hSuffix = new Div();
    Div kSuffix = new Div();
    Div plusSign = new Div();
    Button submit = new Button("Перевірити");
    VerticalLayout surfacesList = new VerticalLayout();

    public MainView() {
        aField.setValue(0.0);
        bField.setValue(0.0);
        cField.setValue(0.0);
        dField.setValue(0.0);
        eField.setValue(0.0);
        fField.setValue(0.0);
        gField.setValue(0.0);
        hField.setValue(0.0);
        kField.setValue(0.0);
        lField.setValue(0.0);
        plusSign.setText("+");
        aSuffix.setText("* x ^ 2");
        aField.setSuffixComponent(aSuffix);
        bSuffix.setText("* y ^ 2");
        bField.setPrefixComponent(plusSign);
        bField.setSuffixComponent(bSuffix);
        cSuffix.setText("* z ^ 2");
        cField.setPrefixComponent(plusSign);
        cField.setSuffixComponent(cSuffix);
        dSuffix.setText("* x * y");
        dField.setSuffixComponent(plusSign);
        dField.setPrefixComponent(dSuffix);
        eSuffix.setText("* x * z");
        eField.setSuffixComponent(eSuffix);
        fSuffix.setText("* y * z");
        fField.setSuffixComponent(fSuffix);
        gSuffix.setText("* x");
        gField.setSuffixComponent(gSuffix);
        hSuffix.setText("* y");
        hField.setSuffixComponent(hSuffix);
        kSuffix.setText("* z");
        kField.setSuffixComponent(kSuffix);

        surfacesList.setSpacing(false);

        submit.addClickListener(click -> {
            Surface surface = SurfaceFactory.create(aField.getValue(), bField.getValue(), cField.getValue(),
                    dField.getValue(), eField.getValue(), fField.getValue(), gField.getValue(), hField.getValue(),
                    kField.getValue(), lField.getValue());
            Image image = new Image(surface.imageSrc(), surface.name());
            Div details = new Div();
            details.setText("Дана поверхня задовольняє рівняння, зображене на малюнку");
            Div surfaceEquation = new Div();
            surfaceEquation.setText(surface.toString());
            surfacesList.add(new HorizontalLayout(new VerticalLayout(new H4(surface.name()), surfaceEquation, details), image));
        });
        submit.addClickShortcut(Key.ENTER);

        setMargin(true);
        add(new H1("Введіть коефіцієнти рівняння поверхні"),
                new HorizontalLayout(aField, bField, cField, dField, eField, fField, gField, hField, kField, lField,
                        submit),
                surfacesList);
    }

}
