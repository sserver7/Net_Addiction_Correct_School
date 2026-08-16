'''from PIL import Image
import os

# 颜色：紫黑格子（0xFF00FF 和 0x000000 交替）
colors = [(0x00, 0xFF, 0xFF), (0x00, 0x00, 0x00)]

def create_placeholder(path):
    img = Image.new('RGB', (16, 16))
    for x in range(16):
        for y in range(16):
            # 棋盘格效果
            color = colors[(x // 8 + y // 8) % 2]
            img.putpixel((x, y), color)
    img.save(path)

# 方块纹理列表
blocks = [
    "reinforced_wall", "school_wall", "school_floor", "school_ceiling",
    "complaint_box", "detention_door_bottom", "detention_door_top", "vent_entrance",
    "confinement_wall", "training_ground_floor", "blood_stain",
    "monitor_center_block", "file_cabinet", "confiscated_item_chest","school_light_side", "school_light_light",
    "entrance_sign", "loose_brick", "surveillance_camera",
    "electric_fence", "bulletin_board", "school_desk", "school_chair", "school_bed"
]

# 物品纹理列表
items = [
    "enrollment_agreement", "tracking_bracelet", "model_student_badge", "rusty_wire",
    "discipline_log", "medical_dossier", "financial_ledger", "distress_note",
    "stale_bread", "sedative", "calming_pill", "compliance_prod", "reinforced_brick",
    "reinforced_rebar", "paper_dust", "instructor_uniform", "visitor_coat",
    "maintenance_garb", "toolbox", "access_card", "lockpick_set"
]

base_dir = "src/main/resources/assets/net_addiction_correct_school/textures"

for name in blocks:
    path = f"{base_dir}/block/{name}.png"
    os.makedirs(os.path.dirname(path), exist_ok=True)
    create_placeholder(path)
    print(f"Created {path}")

for name in items:
    path = f"{base_dir}/item/{name}.png"
    os.makedirs(os.path.dirname(path), exist_ok=True)
    create_placeholder(path)
    print(f"Created {path}")
'''
#已废弃