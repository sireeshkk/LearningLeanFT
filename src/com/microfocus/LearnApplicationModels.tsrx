<?xml version="1.0" encoding="utf-8" standalone="yes"?>
<applicationModel>
    <name>Application Model</name>
    <className>APJ_AM_AOS</className>
    <objects>
        <object type="Link" technology="Web">
            <name>SPEAKERS</name>
            <codeName>SPEAKERSLink</codeName>
            <description></description>
            <identification>
                <properties>
                    <property name="InnerText" type="string" isRegExp="false">SPEAKERS</property>
                    <property name="TagName" type="string" isRegExp="false">SPAN</property>
                </properties>
            </identification>
        </object>
        <object type="Button" technology="Web">
            <name>buy now</name>
            <codeName>BuyNow</codeName>
            <description></description>
            <identification>
                <properties>
                    <property name="ButtonType" type="string" isRegExp="false">submit</property>
                    <property name="Name" type="string" isRegExp="false">BUY NOW</property>
                    <property name="TagName" type="string" isRegExp="false">BUTTON</property>
                </properties>
            </identification>
        </object>
        <object type="Button" technology="Web">
            <name>save_to_cart</name>
            <codeName>SaveToCartButton</codeName>
            <description></description>
            <identification>
                <properties>
                    <property name="ButtonType" type="string" isRegExp="false">submit</property>
                    <property name="Name" type="string" isRegExp="false">ADD TO CART</property>
                    <property name="TagName" type="string" isRegExp="false">BUTTON</property>
                </properties>
            </identification>
        </object>
        <object type="WebElement" technology="Web">
            <name>REMOVE</name>
            <codeName>REMOVEWebElement</codeName>
            <description></description>
            <identification>
                <properties>
                    <property name="InnerText" type="string" isRegExp="true">REM.*</property>
                    <property name="TagName" type="string" isRegExp="false">A</property>
                </properties>
            </identification>
        </object>
        <object type="Link" technology="Web">
            <name>HOME</name>
            <codeName>HOMELink</codeName>
            <description></description>
            <identification>
                <properties>
                    <property name="InnerText" type="string" isRegExp="false">HOME</property>
                    <property name="TagName" type="string" isRegExp="false">A</property>
                </properties>
            </identification>
        </object>
        <object type="WebElement" technology="Web">
            <name>menuCart</name>
            <codeName>MenuCartWebElement</codeName>
            <description></description>
            <identification>
                <properties>
                    <property name="AccessibilityName" type="string" isRegExp="false"></property>
                    <property name="Id" type="string" isRegExp="false">menuCart</property>
                    <property name="InnerText" type="string" isRegExp="false"></property>
                    <property name="TagName" type="string" isRegExp="false">svg</property>
                </properties>
            </identification>
        </object>
        <object type="WebElement" technology="Web">
            <name>total</name>
            <codeName>TotalInCart</codeName>
            <description></description>
            <identification>
                <properties>
                    <property name="ClassName" type="string" isRegExp="false">roboto-medium ng-binding</property>
                    <property name="TagName" type="string" isRegExp="false">SPAN</property>
                    <property name="InnerText" type="string" isRegExp="true">^\$\d+.*</property>
                </properties>
            </identification>
        </object>
    </objects>
</applicationModel>
