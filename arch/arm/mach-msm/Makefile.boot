# MSM8974
   zreladdr-$(CONFIG_ARCH_MSM8974)	:= 0x00008000
## RDD
	ifeq ($(CONFIG_MACH_LGE),y)
        dtb-$(CONFIG_MACH_MSM8974_HAMMERHEAD)	+= msm8974-hammerhead-rev-11.dtb
        dtb-$(CONFIG_MACH_MSM8974_HAMMERHEAD)	+= msm8974-hammerhead-rev-11j.dtb
        dtb-$(CONFIG_MACH_MSM8974_HAMMERHEAD)	+= msm8974-hammerhead-rev-10.dtb
        dtb-$(CONFIG_MACH_MSM8974_HAMMERHEAD)	+= msm8974-hammerhead-rev-c.dtb
        dtb-$(CONFIG_MACH_MSM8974_HAMMERHEAD)	+= msm8974-hammerhead-rev-b.dtb
        dtb-$(CONFIG_MACH_MSM8974_HAMMERHEAD)	+= msm8974-hammerhead-rev-bn.dtb
        dtb-$(CONFIG_MACH_MSM8974_HAMMERHEAD)	+= msm8974-hammerhead-rev-a.dtb
        dtb-$(CONFIG_MACH_MSM8974_HAMMERHEAD)	+= msm8974-hammerhead-rev-f.dtb
else
        dtb-$(CONFIG_ARCH_MSM8974)	+= msm8974-v1-cdp.dtb
        dtb-$(CONFIG_ARCH_MSM8974)	+= msm8974-v1-fluid.dtb
        dtb-$(CONFIG_ARCH_MSM8974)	+= msm8974-v1-liquid.dtb
        dtb-$(CONFIG_ARCH_MSM8974)	+= msm8974-v1-mtp.dtb
        dtb-$(CONFIG_ARCH_MSM8974)	+= msm8974-v1-rumi.dtb
        dtb-$(CONFIG_ARCH_MSM8974)	+= msm8974-v1-sim.dtb
        dtb-$(CONFIG_ARCH_MSM8974)	+= msm8974-v2-cdp.dtb
        dtb-$(CONFIG_ARCH_MSM8974)	+= msm8974-v2-fluid.dtb
        dtb-$(CONFIG_ARCH_MSM8974)	+= msm8974-v2-liquid.dtb
        dtb-$(CONFIG_ARCH_MSM8974)	+= msm8974-v2-mtp.dtb
        dtb-$(CONFIG_ARCH_MSM8974)	+= apq8074-v2-liquid.dtb
        dtb-$(CONFIG_ARCH_MSM8974)	+= apq8074-v2-dragonboard.dtb
        dtb-$(CONFIG_ARCH_MSM8974)	+= msm8974-v2.2-cdp.dtb
        dtb-$(CONFIG_ARCH_MSM8974)	+= msm8974-v2.2-fluid.dtb
        dtb-$(CONFIG_ARCH_MSM8974)	+= msm8974-v2.2-liquid.dtb
        dtb-$(CONFIG_ARCH_MSM8974)	+= msm8974-v2.2-mtp.dtb
endif
## END RDD

# APQ8084
   zreladdr-$(CONFIG_ARCH_APQ8084)	:= 0x00008000

# MDM9630
   zreladdr-$(CONFIG_ARCH_MDM9630)	:= 0x00008000

# MSM8226
   zreladdr-$(CONFIG_ARCH_MSM8226)	:= 0x00008000

# FSM9900
   zreladdr-$(CONFIG_ARCH_FSM9900)	:= 0x11408000

# MPQ8092
   zreladdr-$(CONFIG_ARCH_MPQ8092)	:= 0x00008000

# MSM8916
   zreladdr-$(CONFIG_ARCH_MSM8916)	:= 0x80008000

# MSM8610
   zreladdr-$(CONFIG_ARCH_MSM8610)	:= 0x00008000

# MSMSAMARIUM
   zreladdr-$(CONFIG_ARCH_MSMSAMARIUM)	:= 0x00008000
